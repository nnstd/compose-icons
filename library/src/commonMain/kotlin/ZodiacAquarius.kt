package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacAquarius: ImageVector
    get() {
        if (_ZodiacAquarius != null) {
            return _ZodiacAquarius!!
        }
        _ZodiacAquarius = ImageVector.Builder(
            name = "ZodiacAquarius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12.41f)
                lineTo(12f, 9.41f)
                lineTo(9f, 12.41f)
                lineTo(6f, 9.41f)
                lineTo(3.71f, 11.71f)
                lineTo(2.29f, 10.29f)
                lineTo(6f, 6.59f)
                lineTo(9f, 9.59f)
                lineTo(12f, 6.59f)
                lineTo(15f, 9.59f)
                lineTo(18f, 6.59f)
                lineTo(21.71f, 10.29f)
                lineTo(20.29f, 11.71f)
                lineTo(18f, 9.41f)
                lineTo(15f, 12.41f)
                moveTo(18f, 15.41f)
                lineTo(20.29f, 17.71f)
                lineTo(21.71f, 16.29f)
                lineTo(18f, 12.59f)
                lineTo(15f, 15.59f)
                lineTo(12f, 12.59f)
                lineTo(9f, 15.59f)
                lineTo(6f, 12.59f)
                lineTo(2.29f, 16.29f)
                lineTo(3.71f, 17.71f)
                lineTo(6f, 15.41f)
                lineTo(9f, 18.41f)
                lineTo(12f, 15.41f)
                lineTo(15f, 18.41f)
                lineTo(18f, 15.41f)
                close()
            }
        }.build()

        return _ZodiacAquarius!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacAquarius: ImageVector? = null
