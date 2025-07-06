package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagazinePistol: ImageVector
    get() {
        if (_MagazinePistol != null) {
            return _MagazinePistol!!
        }
        _MagazinePistol = ImageVector.Builder(
            name = "MagazinePistol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 1f)
                lineTo(12f, 3f)
                horizontalLineTo(7f)
                lineTo(9f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                lineTo(16f, 1f)
                moveTo(9f, 5f)
                horizontalLineTo(12f)
                lineTo(12.24f, 7f)
                horizontalLineTo(9.24f)
                moveTo(9.47f, 9f)
                horizontalLineTo(12.47f)
                lineTo(12.71f, 11f)
                horizontalLineTo(9.71f)
                moveTo(9.94f, 13f)
                horizontalLineTo(12.94f)
                lineTo(13.18f, 15f)
                horizontalLineTo(10.18f)
                moveTo(10.41f, 17f)
                horizontalLineTo(13.41f)
                lineTo(13.65f, 19f)
                horizontalLineTo(10.65f)
                close()
            }
        }.build()

        return _MagazinePistol!!
    }

@Suppress("ObjectPropertyName")
private var _MagazinePistol: ImageVector? = null
