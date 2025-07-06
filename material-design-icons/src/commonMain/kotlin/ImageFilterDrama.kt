package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterDrama: ImageVector
    get() {
        if (_ImageFilterDrama != null) {
            return _ImageFilterDrama!!
        }
        _ImageFilterDrama = ImageVector.Builder(
            name = "ImageFilterDrama",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 20f)
                horizontalLineTo(18.5f)
                quadTo(20.38f, 20f, 21.69f, 18.69f)
                quadTo(23f, 17.38f, 23f, 15.5f)
                quadTo(23f, 13.8f, 21.79f, 12.4f)
                quadTo(20.58f, 11f, 19f, 11f)
                quadTo(19f, 8.05f, 17f, 6.03f)
                quadTo(14.95f, 4f, 12f, 4f)
                quadTo(9.88f, 4f, 8.29f, 5.08f)
                quadTo(6.7f, 6.15f, 6.25f, 8f)
                quadTo(8.8f, 8.45f, 10.4f, 10.19f)
                quadTo(12f, 11.93f, 12f, 14.5f)
                horizontalLineTo(10f)
                quadTo(10f, 12.68f, 8.66f, 11.34f)
                quadTo(7.33f, 10f, 5.5f, 10f)
                reflectiveQuadTo(2.34f, 11.34f)
                quadTo(1f, 12.68f, 1f, 14.5f)
                quadTo(1f, 16.8f, 2.6f, 18.4f)
                reflectiveQuadTo(6.5f, 20f)
                close()
            }
        }.build()

        return _ImageFilterDrama!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterDrama: ImageVector? = null
