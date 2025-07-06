package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ZodiacAries: ImageVector
    get() {
        if (_ZodiacAries != null) {
            return _ZodiacAries!!
        }
        _ZodiacAries = ImageVector.Builder(
            name = "ZodiacAries",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                curveTo(14.95f, 2f, 13.91f, 2.27f, 13f, 2.81f)
                curveTo(12.64f, 3f, 12.3f, 3.26f, 12f, 3.54f)
                curveTo(11.7f, 3.26f, 11.36f, 3f, 11f, 2.81f)
                curveTo(10.09f, 2.27f, 9.05f, 2f, 8f, 2f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14f)
                verticalLineTo(12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
                curveTo(9f, 4f, 10f, 4.39f, 10.75f, 5.1f)
                curveTo(10.84f, 5.18f, 10.92f, 5.27f, 11f, 5.36f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(5.36f)
                curveTo(13.08f, 5.27f, 13.16f, 5.18f, 13.25f, 5.1f)
                curveTo(14.85f, 3.58f, 17.38f, 3.64f, 18.91f, 5.25f)
                curveTo(20.43f, 6.85f, 20.36f, 9.38f, 18.76f, 10.9f)
                curveTo(18f, 11.61f, 17.03f, 12f, 16f, 12f)
                verticalLineTo(14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2f)
                close()
            }
        }.build()

        return _ZodiacAries!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacAries: ImageVector? = null
