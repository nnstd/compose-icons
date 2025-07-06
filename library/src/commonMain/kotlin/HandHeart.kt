package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandHeart: ImageVector
    get() {
        if (_HandHeart != null) {
            return _HandHeart!!
        }
        _HandHeart = ImageVector.Builder(
            name = "HandHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17f)
                quadTo(20.86f, 17f, 21.45f, 17.6f)
                reflectiveQuadTo(22.03f, 19f)
                lineTo(14f, 22f)
                lineTo(7f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(8.95f)
                lineTo(16.22f, 13.69f)
                quadTo(17f, 14f, 17f, 14.81f)
                quadTo(17f, 15.28f, 16.66f, 15.63f)
                reflectiveQuadTo(15.8f, 16f)
                horizontalLineTo(13f)
                lineTo(11.25f, 15.33f)
                lineTo(10.92f, 16.27f)
                lineTo(13f, 17f)
                horizontalLineTo(20f)
                moveTo(16f, 3.23f)
                quadTo(17.06f, 2f, 18.7f, 2f)
                quadTo(20.06f, 2f, 21f, 3f)
                reflectiveQuadTo(22f, 5.3f)
                quadTo(22f, 6.33f, 21f, 7.76f)
                reflectiveQuadTo(19.03f, 10.15f)
                reflectiveQuadTo(16f, 13f)
                quadTo(13.92f, 11.11f, 12.94f, 10.15f)
                reflectiveQuadTo(10.97f, 7.76f)
                reflectiveQuadTo(10f, 5.3f)
                quadTo(10f, 3.94f, 10.97f, 3f)
                reflectiveQuadTo(13.31f, 2f)
                quadTo(14.91f, 2f, 16f, 3.23f)
                moveTo(0.984f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(0.984f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _HandHeart!!
    }

@Suppress("ObjectPropertyName")
private var _HandHeart: ImageVector? = null
