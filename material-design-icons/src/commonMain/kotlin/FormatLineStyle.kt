package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatLineStyle: ImageVector
    get() {
        if (_FormatLineStyle != null) {
            return _FormatLineStyle!!
        }
        _FormatLineStyle = ImageVector.Builder(
            name = "FormatLineStyle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(9.5f, 16f)
                horizontalLineTo(14.5f)
                verticalLineTo(14f)
                horizontalLineTo(9.5f)
                verticalLineTo(16f)
                moveTo(16f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                moveTo(3f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                moveTo(7f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                moveTo(11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                moveTo(15f, 20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                moveTo(19f, 20f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                moveTo(3f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                moveTo(13f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                moveTo(3f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _FormatLineStyle!!
    }

@Suppress("ObjectPropertyName")
private var _FormatLineStyle: ImageVector? = null
