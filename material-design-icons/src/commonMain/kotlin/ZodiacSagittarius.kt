package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacSagittarius: ImageVector
    get() {
        if (_ZodiacSagittarius != null) {
            return _ZodiacSagittarius!!
        }
        _ZodiacSagittarius = ImageVector.Builder(
            name = "ZodiacSagittarius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(5.41f)
                lineTo(10.41f, 15f)
                lineTo(12.71f, 17.29f)
                lineTo(11.29f, 18.71f)
                lineTo(9f, 16.41f)
                lineTo(3.71f, 21.71f)
                lineTo(2.29f, 20.29f)
                lineTo(7.59f, 15f)
                lineTo(5.29f, 12.71f)
                lineTo(6.71f, 11.29f)
                lineTo(9f, 13.59f)
                lineTo(18.59f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ZodiacSagittarius!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacSagittarius: ImageVector? = null
