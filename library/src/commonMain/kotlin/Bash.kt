package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bash: ImageVector
    get() {
        if (_Bash != null) {
            return _Bash!!
        }
        _Bash = ImageVector.Builder(
            name = "Bash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                horizontalLineTo(7.31f)
                lineTo(7.63f, 6f)
                horizontalLineTo(9.63f)
                lineTo(9.31f, 9f)
                horizontalLineTo(11.31f)
                lineTo(11.63f, 6f)
                horizontalLineTo(13.63f)
                lineTo(13.31f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13.1f)
                lineTo(12.9f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(12.69f)
                lineTo(12.37f, 18f)
                horizontalLineTo(10.37f)
                lineTo(10.69f, 15f)
                horizontalLineTo(8.69f)
                lineTo(8.37f, 18f)
                horizontalLineTo(6.37f)
                lineTo(6.69f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(6.9f)
                lineTo(7.1f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                moveTo(9.1f, 11f)
                lineTo(8.9f, 13f)
                horizontalLineTo(10.9f)
                lineTo(11.1f, 11f)
                moveTo(19f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                moveTo(19f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Bash!!
    }

@Suppress("ObjectPropertyName")
private var _Bash: ImageVector? = null
