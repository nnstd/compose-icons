package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxEditOutline: ImageVector
    get() {
        if (_TextBoxEditOutline != null) {
            return _TextBoxEditOutline!!
        }
        _TextBoxEditOutline = ImageVector.Builder(
            name = "TextBoxEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(10.33f)
                curveTo(20.7f, 10.21f, 20.37f, 10.14f, 20.04f, 10.14f)
                curveTo(19.67f, 10.14f, 19.32f, 10.22f, 19f, 10.37f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(10.11f)
                lineTo(10f, 19.11f)
                verticalLineTo(21f)
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(7f, 17f)
                horizontalLineTo(12.11f)
                lineTo(14f, 15.12f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                moveTo(7f, 13f)
                horizontalLineTo(16.12f)
                lineTo(17f, 12.12f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                moveTo(21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                curveTo(20.21f, 12.09f, 19.86f, 12.09f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.91f, 14.14f, 21.91f, 13.79f, 21.7f, 13.58f)
                moveTo(12f, 22f)
                horizontalLineTo(14.06f)
                lineTo(20.11f, 15.93f)
                lineTo(18.06f, 13.88f)
                lineTo(12f, 19.94f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _TextBoxEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxEditOutline: ImageVector? = null
