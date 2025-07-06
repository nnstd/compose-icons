package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabetLatin: ImageVector
    get() {
        if (_AlphabetLatin != null) {
            return _AlphabetLatin!!
        }
        _AlphabetLatin = ImageVector.Builder(
            name = "AlphabetLatin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(17.31f)
                curveTo(15.37f, 17.73f, 15.9f, 18f, 16.5f, 18f)
                horizontalLineTo(17f)
                curveTo(18.65f, 18f, 20f, 16.65f, 20f, 15f)
                verticalLineTo(12f)
                curveTo(20f, 10.36f, 18.65f, 9f, 17f, 9f)
                horizontalLineTo(16.5f)
                curveTo(15.9f, 9f, 15.37f, 9.27f, 15f, 9.7f)
                verticalLineTo(6f)
                moveTo(5f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                curveTo(8.57f, 11f, 9f, 11.43f, 9f, 12f)
                horizontalLineTo(7f)
                curveTo(5.36f, 12f, 4f, 13.36f, 4f, 15f)
                curveTo(4f, 16.65f, 5.36f, 18f, 7f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                curveTo(11f, 10.36f, 9.65f, 9f, 8f, 9f)
                moveTo(16f, 11f)
                horizontalLineTo(17f)
                curveTo(17.57f, 11f, 18f, 11.43f, 18f, 12f)
                verticalLineTo(15f)
                curveTo(18f, 15.57f, 17.57f, 16f, 17f, 16f)
                horizontalLineTo(16f)
                curveTo(15.43f, 16f, 15f, 15.57f, 15f, 15f)
                verticalLineTo(12f)
                curveTo(15f, 11.43f, 15.43f, 11f, 16f, 11f)
                moveTo(7f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                curveTo(6.43f, 16f, 6f, 15.57f, 6f, 15f)
                curveTo(6f, 14.43f, 6.43f, 14f, 7f, 14f)
                close()
            }
        }.build()

        return _AlphabetLatin!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabetLatin: ImageVector? = null
