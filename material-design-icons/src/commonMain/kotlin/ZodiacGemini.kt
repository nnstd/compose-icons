package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacGemini: ImageVector
    get() {
        if (_ZodiacGemini != null) {
            return _ZodiacGemini!!
        }
        _ZodiacGemini = ImageVector.Builder(
            name = "ZodiacGemini",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 5.3f)
                curveTo(19.35f, 4.97f, 20.66f, 4.54f, 21.94f, 4f)
                lineTo(21.18f, 2.14f)
                curveTo(18.27f, 3.36f, 15.15f, 4f, 12f, 4f)
                curveTo(8.85f, 4f, 5.73f, 3.38f, 2.82f, 2.17f)
                lineTo(2.06f, 4f)
                curveTo(3.34f, 4.54f, 4.65f, 4.97f, 6f, 5.3f)
                verticalLineTo(18.7f)
                curveTo(4.65f, 19.03f, 3.34f, 19.46f, 2.06f, 20f)
                lineTo(2.82f, 21.86f)
                curveTo(8.7f, 19.42f, 15.3f, 19.42f, 21.18f, 21.86f)
                lineTo(21.94f, 20f)
                curveTo(20.66f, 19.46f, 19.35f, 19.03f, 18f, 18.7f)
                verticalLineTo(5.3f)
                moveTo(8f, 18.3f)
                verticalLineTo(5.69f)
                curveTo(9.32f, 5.89f, 10.66f, 6f, 12f, 6f)
                curveTo(13.34f, 6f, 14.68f, 5.89f, 16f, 5.69f)
                verticalLineTo(18.31f)
                curveTo(13.35f, 17.9f, 10.65f, 17.9f, 8f, 18.31f)
                verticalLineTo(18.3f)
                close()
            }
        }.build()

        return _ZodiacGemini!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacGemini: ImageVector? = null
