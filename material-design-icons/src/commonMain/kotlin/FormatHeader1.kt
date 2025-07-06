package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeader1: ImageVector
    get() {
        if (_FormatHeader1 != null) {
            return _FormatHeader1!!
        }
        _FormatHeader1 = ImageVector.Builder(
            name = "FormatHeader1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(14f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(6.31f)
                lineTo(13.5f, 7.75f)
                verticalLineTo(5.44f)
                lineTo(16f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _FormatHeader1!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeader1: ImageVector? = null
