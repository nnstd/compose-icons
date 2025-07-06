package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpoonSugar: ImageVector
    get() {
        if (_SpoonSugar != null) {
            return _SpoonSugar!!
        }
        _SpoonSugar = ImageVector.Builder(
            name = "SpoonSugar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                moveTo(10f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                moveTo(8f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(18f, 12f)
                curveTo(14.25f, 12f, 12.28f, 13.25f, 11f, 14f)
                horizontalLineTo(2f)
                curveTo(2f, 16.21f, 3.79f, 18f, 6f, 18f)
                horizontalLineTo(7f)
                curveTo(8f, 18f, 8.92f, 17.63f, 9.62f, 17f)
                curveTo(11.06f, 15.78f, 12.68f, 14.74f, 14.55f, 14.36f)
                curveTo(15.61f, 14.15f, 16.78f, 14f, 18f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _SpoonSugar!!
    }

@Suppress("ObjectPropertyName")
private var _SpoonSugar: ImageVector? = null
