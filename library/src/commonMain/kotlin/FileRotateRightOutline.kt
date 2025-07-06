package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileRotateRightOutline: ImageVector
    get() {
        if (_FileRotateRightOutline != null) {
            return _FileRotateRightOutline!!
        }
        _FileRotateRightOutline = ImageVector.Builder(
            name = "FileRotateRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                horizontalLineTo(23f)
                lineTo(19f, 15f)
                lineTo(15f, 11f)
                horizontalLineTo(18f)
                curveTo(18f, 7.69f, 15.31f, 5f, 12f, 5f)
                lineTo(11f, 5.08f)
                verticalLineTo(3.06f)
                lineTo(12f, 3f)
                curveTo(16.42f, 3f, 20f, 6.58f, 20f, 11f)
                moveTo(9f, 7f)
                horizontalLineTo(5f)
                curveTo(3.9f, 7f, 3f, 7.9f, 3f, 9f)
                verticalLineTo(18f)
                curveTo(3f, 19.11f, 3.9f, 20f, 5f, 20f)
                horizontalLineTo(11f)
                curveTo(12.11f, 20f, 13f, 19.11f, 13f, 18f)
                verticalLineTo(11f)
                lineTo(9f, 7f)
                moveTo(11f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FileRotateRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileRotateRightOutline: ImageVector? = null
