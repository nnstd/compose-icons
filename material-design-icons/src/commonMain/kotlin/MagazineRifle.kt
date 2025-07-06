package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagazineRifle: ImageVector
    get() {
        if (_MagazineRifle != null) {
            return _MagazineRifle!!
        }
        _MagazineRifle = ImageVector.Builder(
            name = "MagazineRifle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                lineTo(5f, 19f)
                lineTo(14f, 23f)
                lineTo(18f, 13f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(1f)
                moveTo(10f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(11.88f)
                verticalLineTo(13.45f)
                lineTo(9.6f, 18.14f)
                lineTo(8f, 17.5f)
                lineTo(10f, 13.5f)
                close()
            }
        }.build()

        return _MagazineRifle!!
    }

@Suppress("ObjectPropertyName")
private var _MagazineRifle: ImageVector? = null
