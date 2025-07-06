package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudCircle: ImageVector
    get() {
        if (_CloudCircle != null) {
            return _CloudCircle!!
        }
        _CloudCircle = ImageVector.Builder(
            name = "CloudCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 16f)
                horizontalLineTo(16f)
                quadTo(17.25f, 16f, 18.13f, 15.13f)
                reflectiveQuadTo(19f, 13f)
                quadTo(19f, 11.75f, 18.13f, 10.88f)
                reflectiveQuadTo(16f, 10f)
                quadTo(15.8f, 8.55f, 14.68f, 7.53f)
                quadTo(13.55f, 6.5f, 12.15f, 6.5f)
                quadTo(10.88f, 6.5f, 9.84f, 7.15f)
                quadTo(8.8f, 7.8f, 8.3f, 9f)
                quadTo(6.88f, 9.13f, 5.94f, 10.09f)
                quadTo(5f, 11.05f, 5f, 12.5f)
                quadTo(5f, 13.95f, 6.03f, 15f)
                quadTo(7.05f, 16f, 8.5f, 16f)
                moveTo(12f, 22f)
                quadTo(9.93f, 22f, 8.1f, 21.21f)
                quadTo(6.28f, 20.43f, 4.93f, 19.08f)
                quadTo(3.58f, 17.73f, 2.79f, 15.9f)
                quadTo(2f, 14.08f, 2f, 12f)
                reflectiveQuadTo(2.79f, 8.1f)
                quadTo(3.58f, 6.28f, 4.93f, 4.93f)
                quadTo(6.28f, 3.58f, 8.1f, 2.79f)
                quadTo(9.93f, 2f, 12f, 2f)
                reflectiveQuadTo(15.9f, 2.79f)
                quadTo(17.73f, 3.58f, 19.08f, 4.93f)
                quadTo(20.43f, 6.28f, 21.21f, 8.1f)
                quadTo(22f, 9.93f, 22f, 12f)
                reflectiveQuadTo(21.21f, 15.9f)
                quadTo(20.43f, 17.73f, 19.08f, 19.08f)
                quadTo(17.73f, 20.43f, 15.9f, 21.21f)
                quadTo(14.08f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _CloudCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCircle: ImageVector? = null
