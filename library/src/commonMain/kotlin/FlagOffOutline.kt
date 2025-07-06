package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagOffOutline: ImageVector
    get() {
        if (_FlagOffOutline != null) {
            return _FlagOffOutline!!
        }
        _FlagOffOutline = ImageVector.Builder(
            name = "FlagOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5f, 6.89f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(12.11f)
                lineTo(12.72f, 14.61f)
                lineTo(13f, 16f)
                horizontalLineTo(14.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7f, 12f)
                verticalLineTo(8.89f)
                lineTo(10.11f, 12f)
                horizontalLineTo(7f)
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(14f)
                lineTo(14.4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(19.2f)
                lineTo(17.2f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(12.76f)
                lineTo(12.36f, 6f)
                horizontalLineTo(9.2f)
                close()
            }
        }.build()

        return _FlagOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagOffOutline: ImageVector? = null
