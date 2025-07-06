package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxEdit: ImageVector
    get() {
        if (_TextBoxEdit != null) {
            return _TextBoxEdit!!
        }
        _TextBoxEdit = ImageVector.Builder(
            name = "TextBoxEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19.11f)
                lineTo(12.11f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(15.12f)
                lineTo(16.12f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(12.12f)
                lineTo(18.24f, 10.89f)
                curveTo(18.72f, 10.41f, 19.35f, 10.14f, 20.04f, 10.14f)
                curveTo(20.37f, 10.14f, 20.7f, 10.21f, 21f, 10.33f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19.11f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(21.7f, 14.35f)
                lineTo(20.7f, 15.35f)
                lineTo(18.65f, 13.3f)
                lineTo(19.65f, 12.3f)
                curveTo(19.86f, 12.09f, 20.21f, 12.09f, 20.42f, 12.3f)
                lineTo(21.7f, 13.58f)
                curveTo(21.91f, 13.79f, 21.91f, 14.14f, 21.7f, 14.35f)
                moveTo(12f, 19.94f)
                lineTo(18.06f, 13.88f)
                lineTo(20.11f, 15.93f)
                lineTo(14.06f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(19.94f)
                close()
            }
        }.build()

        return _TextBoxEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxEdit: ImageVector? = null
