package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabetCyrillic: ImageVector
    get() {
        if (_AlphabetCyrillic != null) {
            return _AlphabetCyrillic!!
        }
        _AlphabetCyrillic = ImageVector.Builder(
            name = "AlphabetCyrillic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6f)
                curveTo(14.36f, 6f, 13f, 7.36f, 13f, 9f)
                verticalLineTo(15f)
                curveTo(13f, 16.65f, 14.36f, 18f, 16f, 18f)
                horizontalLineTo(17f)
                curveTo(18.65f, 18f, 20f, 16.65f, 20f, 15f)
                verticalLineTo(12f)
                curveTo(20f, 10.36f, 18.65f, 9f, 17f, 9f)
                horizontalLineTo(15f)
                curveTo(15f, 8.44f, 15.44f, 8f, 16f, 8f)
                horizontalLineTo(18f)
                curveTo(19.09f, 8f, 20f, 7.09f, 20f, 6f)
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
                moveTo(15f, 11f)
                horizontalLineTo(17f)
                curveTo(17.57f, 11f, 18f, 11.43f, 18f, 12f)
                verticalLineTo(15f)
                curveTo(18f, 15.57f, 17.57f, 16f, 17f, 16f)
                horizontalLineTo(16f)
                curveTo(15.43f, 16f, 15f, 15.57f, 15f, 15f)
                moveTo(7f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                curveTo(6.43f, 16f, 6f, 15.57f, 6f, 15f)
                curveTo(6f, 14.43f, 6.43f, 14f, 7f, 14f)
                close()
            }
        }.build()

        return _AlphabetCyrillic!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabetCyrillic: ImageVector? = null
