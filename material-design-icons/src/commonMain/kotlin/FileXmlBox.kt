package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileXmlBox: ImageVector
    get() {
        if (_FileXmlBox != null) {
            return _FileXmlBox!!
        }
        _FileXmlBox = ImageVector.Builder(
            name = "FileXmlBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                moveTo(8f, 15f)
                horizontalLineTo(6.5f)
                lineTo(6f, 13f)
                lineTo(5.5f, 15f)
                horizontalLineTo(4f)
                lineTo(4.75f, 12f)
                lineTo(4f, 9f)
                horizontalLineTo(5.5f)
                lineTo(6f, 11f)
                lineTo(6.5f, 9f)
                horizontalLineTo(8f)
                lineTo(7.25f, 12f)
                lineTo(8f, 15f)
                moveTo(15.5f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(10.5f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                curveTo(9f, 9.9f, 9.9f, 9f, 11f, 9f)
                horizontalLineTo(13.5f)
                curveTo(14.61f, 9f, 15.5f, 9.9f, 15.5f, 11f)
                verticalLineTo(15f)
                moveTo(20f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(18.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FileXmlBox!!
    }

@Suppress("ObjectPropertyName")
private var _FileXmlBox: ImageVector? = null
