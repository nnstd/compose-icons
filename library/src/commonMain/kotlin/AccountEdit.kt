package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountEdit: ImageVector
    get() {
        if (_AccountEdit != null) {
            return _AccountEdit!!
        }
        _AccountEdit = ImageVector.Builder(
            name = "AccountEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.3f)
                lineTo(19.65f, 11.3f)
                curveTo(19.86f, 11.09f, 20.21f, 11.09f, 20.42f, 11.3f)
                lineTo(21.7f, 12.58f)
                curveTo(21.91f, 12.79f, 21.91f, 13.14f, 21.7f, 13.35f)
                moveTo(12f, 18.94f)
                lineTo(18.06f, 12.88f)
                lineTo(20.11f, 14.93f)
                lineTo(14.06f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(18.94f)
                moveTo(12f, 14f)
                curveTo(7.58f, 14f, 4f, 15.79f, 4f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18.11f)
                lineTo(14f, 14.11f)
                curveTo(13.34f, 14.03f, 12.67f, 14f, 12f, 14f)
                moveTo(12f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _AccountEdit!!
    }

@Suppress("ObjectPropertyName")
private var _AccountEdit: ImageVector? = null
