package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatProcessingOutline: ImageVector
    get() {
        if (_ChatProcessingOutline != null) {
            return _ChatProcessingOutline!!
        }
        _ChatProcessingOutline = ImageVector.Builder(
            name = "ChatProcessingOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(6.5f, 3f, 2f, 6.58f, 2f, 11f)
                curveTo(2.05f, 13.15f, 3.06f, 15.17f, 4.75f, 16.5f)
                curveTo(4.75f, 17.1f, 4.33f, 18.67f, 2f, 21f)
                curveTo(4.37f, 20.89f, 6.64f, 20f, 8.47f, 18.5f)
                curveTo(9.61f, 18.83f, 10.81f, 19f, 12f, 19f)
                curveTo(17.5f, 19f, 22f, 15.42f, 22f, 11f)
                reflectiveCurveTo(17.5f, 3f, 12f, 3f)
                moveTo(12f, 17f)
                curveTo(7.58f, 17f, 4f, 14.31f, 4f, 11f)
                reflectiveCurveTo(7.58f, 5f, 12f, 5f)
                reflectiveCurveTo(20f, 7.69f, 20f, 11f)
                reflectiveCurveTo(16.42f, 17f, 12f, 17f)
                moveTo(17f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                moveTo(13f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                moveTo(9f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ChatProcessingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChatProcessingOutline: ImageVector? = null
