package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterDramaOutline: ImageVector
    get() {
        if (_ImageFilterDramaOutline != null) {
            return _ImageFilterDramaOutline!!
        }
        _ImageFilterDramaOutline = ImageVector.Builder(
            name = "ImageFilterDramaOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 20f)
                quadTo(4.2f, 20f, 2.6f, 18.4f)
                reflectiveQuadTo(1f, 14.5f)
                quadTo(1f, 12.55f, 2.21f, 11.06f)
                quadTo(3.43f, 9.57f, 5.25f, 9.15f)
                quadTo(5.88f, 6.9f, 7.73f, 5.45f)
                quadTo(9.57f, 4f, 12f, 4f)
                quadTo(15f, 4f, 17f, 6.06f)
                quadTo(19f, 8.13f, 19f, 11f)
                quadTo(20.88f, 11.2f, 21.94f, 12.55f)
                quadTo(23f, 13.9f, 23f, 15.5f)
                quadTo(23f, 17.35f, 21.69f, 18.68f)
                quadTo(20.38f, 20f, 18.5f, 20f)
                moveTo(6.5f, 18f)
                horizontalLineTo(18.5f)
                quadTo(19.55f, 18f, 20.27f, 17.27f)
                quadTo(21f, 16.55f, 21f, 15.5f)
                quadTo(21f, 14.45f, 20.27f, 13.73f)
                quadTo(19.55f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                quadTo(17f, 8.93f, 15.54f, 7.46f)
                quadTo(14.08f, 6f, 12f, 6f)
                quadTo(10.43f, 6f, 9.2f, 6.86f)
                quadTo(8f, 7.73f, 7.4f, 9.07f)
                quadTo(9.35f, 9.4f, 10.68f, 10.91f)
                quadTo(12f, 12.43f, 12f, 14.5f)
                horizontalLineTo(10f)
                quadTo(10f, 13.05f, 9f, 12.03f)
                quadTo(7.95f, 11f, 6.5f, 11f)
                quadTo(5.05f, 11f, 4.03f, 12.03f)
                quadTo(3f, 13.05f, 3f, 14.5f)
                quadTo(3f, 15.95f, 4.03f, 17f)
                quadTo(5.05f, 18f, 6.5f, 18f)
                close()
            }
        }.build()

        return _ImageFilterDramaOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterDramaOutline: ImageVector? = null
