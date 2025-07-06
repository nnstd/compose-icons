package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AbugidaDevanagari: ImageVector
    get() {
        if (_AbugidaDevanagari != null) {
            return _AbugidaDevanagari!!
        }
        _AbugidaDevanagari = ImageVector.Builder(
            name = "AbugidaDevanagari",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                curveTo(12.32f, 5f, 13.41f, 5.83f, 13.82f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                curveTo(9.25f, 10f, 7f, 12.25f, 7f, 15f)
                curveTo(7f, 17.75f, 9.25f, 20f, 12f, 20f)
                curveTo(12.77f, 20f, 13.45f, 19.73f, 14f, 19.3f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                curveTo(13.55f, 17.62f, 12.83f, 18f, 12f, 18f)
                curveTo(10.33f, 18f, 9f, 16.67f, 9f, 15f)
                curveTo(9f, 13.33f, 10.33f, 12f, 12f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(15.9f)
                curveTo(15.43f, 4.72f, 13.41f, 3f, 11f, 3f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _AbugidaDevanagari!!
    }

@Suppress("ObjectPropertyName")
private var _AbugidaDevanagari: ImageVector? = null
