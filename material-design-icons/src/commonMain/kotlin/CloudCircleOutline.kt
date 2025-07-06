package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudCircleOutline: ImageVector
    get() {
        if (_CloudCircleOutline != null) {
            return _CloudCircleOutline!!
        }
        _CloudCircleOutline = ImageVector.Builder(
            name = "CloudCircleOutline",
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
                moveTo(12f, 20f)
                quadTo(15.33f, 20f, 17.66f, 17.66f)
                quadTo(20f, 15.33f, 20f, 12f)
                reflectiveQuadTo(17.66f, 6.34f)
                quadTo(15.33f, 4f, 12f, 4f)
                reflectiveQuadTo(6.34f, 6.34f)
                quadTo(4f, 8.68f, 4f, 12f)
                reflectiveQuadTo(6.34f, 17.66f)
                quadTo(8.68f, 20f, 12f, 20f)
                moveTo(8.5f, 14f)
                quadTo(7.88f, 14f, 7.44f, 13.56f)
                quadTo(7f, 13.13f, 7f, 12.5f)
                reflectiveQuadTo(7.44f, 11.44f)
                quadTo(7.88f, 11f, 8.5f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(10.5f)
                quadTo(10f, 9.68f, 10.59f, 9.09f)
                quadTo(11.18f, 8.5f, 12f, 8.5f)
                reflectiveQuadTo(13.41f, 9.09f)
                quadTo(14f, 9.68f, 14f, 10.5f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                quadTo(16.43f, 12f, 16.71f, 12.29f)
                quadTo(17f, 12.58f, 17f, 13f)
                reflectiveQuadTo(16.71f, 13.71f)
                quadTo(16.43f, 14f, 16f, 14f)
                moveTo(12f, 12f)
                close()
            }
        }.build()

        return _CloudCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCircleOutline: ImageVector? = null
