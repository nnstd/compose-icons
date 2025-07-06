package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCancel: ImageVector
    get() {
        if (_FileCancel != null) {
            return _FileCancel!!
        }
        _FileCancel = ImageVector.Builder(
            name = "FileCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                moveTo(10.5f, 11f)
                curveTo(8f, 11f, 6f, 13f, 6f, 15.5f)
                curveTo(6f, 18f, 8f, 20f, 10.5f, 20f)
                curveTo(13f, 20f, 15f, 18f, 15f, 15.5f)
                curveTo(15f, 13f, 13f, 11f, 10.5f, 11f)
                moveTo(10.5f, 12.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 15.5f)
                curveTo(13.5f, 16.06f, 13.35f, 16.58f, 13.08f, 17f)
                lineTo(9f, 12.92f)
                curveTo(9.42f, 12.65f, 9.94f, 12.5f, 10.5f, 12.5f)
                moveTo(7.5f, 15.5f)
                curveTo(7.5f, 14.94f, 7.65f, 14.42f, 7.92f, 14f)
                lineTo(12f, 18.08f)
                curveTo(11.58f, 18.35f, 11.06f, 18.5f, 10.5f, 18.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 15.5f)
                close()
            }
        }.build()

        return _FileCancel!!
    }

@Suppress("ObjectPropertyName")
private var _FileCancel: ImageVector? = null
