package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MedicalCottonSwab: ImageVector
    get() {
        if (_MedicalCottonSwab != null) {
            return _MedicalCottonSwab!!
        }
        _MedicalCottonSwab = ImageVector.Builder(
            name = "MedicalCottonSwab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(2f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                moveTo(5f, 12f)
                horizontalLineTo(7.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                moveTo(20f, 6f)
                curveTo(18.3f, 6f, 17f, 7.8f, 17f, 10f)
                curveTo(17f, 11.8f, 17.8f, 13.2f, 19f, 13.8f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(13.8f)
                curveTo(22.2f, 13.3f, 23f, 11.8f, 23f, 10f)
                curveTo(23f, 7.8f, 21.7f, 6f, 20f, 6f)
                close()
            }
        }.build()

        return _MedicalCottonSwab!!
    }

@Suppress("ObjectPropertyName")
private var _MedicalCottonSwab: ImageVector? = null
