package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeaderIncrease: ImageVector
    get() {
        if (_FormatHeaderIncrease != null) {
            return _FormatHeaderIncrease!!
        }
        _FormatHeaderIncrease = ImageVector.Builder(
            name = "FormatHeaderIncrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(14.59f, 7.41f)
                lineTo(18.17f, 11f)
                lineTo(14.59f, 14.59f)
                lineTo(16f, 16f)
                lineTo(21f, 11f)
                lineTo(16f, 6f)
                lineTo(14.59f, 7.41f)
                close()
            }
        }.build()

        return _FormatHeaderIncrease!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeaderIncrease: ImageVector? = null
