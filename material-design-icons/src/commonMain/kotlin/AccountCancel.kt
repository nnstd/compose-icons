package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCancel: ImageVector
    get() {
        if (_AccountCancel != null) {
            return _AccountCancel!!
        }
        _AccountCancel = ImageVector.Builder(
            name = "AccountCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                moveTo(17.5f, 13f)
                curveTo(15f, 13f, 13f, 15f, 13f, 17.5f)
                curveTo(13f, 20f, 15f, 22f, 17.5f, 22f)
                curveTo(20f, 22f, 22f, 20f, 22f, 17.5f)
                curveTo(22f, 15f, 20f, 13f, 17.5f, 13f)
                moveTo(10f, 14f)
                curveTo(5.58f, 14f, 2f, 15.79f, 2f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(11.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 17.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.95f, 14.14f)
                curveTo(11.32f, 14.06f, 10.68f, 14f, 10f, 14f)
                moveTo(17.5f, 14.5f)
                curveTo(19.16f, 14.5f, 20.5f, 15.84f, 20.5f, 17.5f)
                curveTo(20.5f, 18.06f, 20.35f, 18.58f, 20.08f, 19f)
                lineTo(16f, 14.92f)
                curveTo(16.42f, 14.65f, 16.94f, 14.5f, 17.5f, 14.5f)
                moveTo(14.92f, 16f)
                lineTo(19f, 20.08f)
                curveTo(18.58f, 20.35f, 18.06f, 20.5f, 17.5f, 20.5f)
                curveTo(15.84f, 20.5f, 14.5f, 19.16f, 14.5f, 17.5f)
                curveTo(14.5f, 16.94f, 14.65f, 16.42f, 14.92f, 16f)
                close()
            }
        }.build()

        return _AccountCancel!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCancel: ImageVector? = null
