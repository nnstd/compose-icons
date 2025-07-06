package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveCheck: ImageVector
    get() {
        if (_ContentSaveCheck != null) {
            return _ContentSaveCheck!!
        }
        _ContentSaveCheck = ImageVector.Builder(
            name = "ContentSaveCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(11.81f)
                curveTo(11.42f, 20.34f, 11.17f, 19.6f, 11.07f, 18.84f)
                curveTo(9.5f, 18.31f, 8.66f, 16.6f, 9.2f, 15.03f)
                curveTo(9.61f, 13.83f, 10.73f, 13f, 12f, 13f)
                curveTo(12.44f, 13f, 12.88f, 13.1f, 13.28f, 13.29f)
                curveTo(15.57f, 11.5f, 18.83f, 11.59f, 21f, 13.54f)
                verticalLineTo(7f)
                lineTo(17f, 3f)
                moveTo(15f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(15.75f, 21f)
                lineTo(13f, 18f)
                lineTo(14.16f, 16.84f)
                lineTo(15.75f, 18.43f)
                lineTo(19.34f, 14.84f)
                lineTo(20.5f, 16.25f)
                lineTo(15.75f, 21f)
            }
        }.build()

        return _ContentSaveCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveCheck: ImageVector? = null
