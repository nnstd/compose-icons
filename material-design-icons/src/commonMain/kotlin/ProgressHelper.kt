package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressHelper: ImageVector
    get() {
        if (_ProgressHelper != null) {
            return _ProgressHelper!!
        }
        _ProgressHelper = ImageVector.Builder(
            name = "ProgressHelper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                verticalLineTo(4f)
                curveTo(17.39f, 4.54f, 20.5f, 8.53f, 19.96f, 12.92f)
                curveTo(19.5f, 16.56f, 16.64f, 19.43f, 13f, 19.88f)
                verticalLineTo(21.88f)
                curveTo(18.5f, 21.28f, 22.45f, 16.34f, 21.85f, 10.85f)
                curveTo(21.33f, 6.19f, 17.66f, 2.5f, 13f, 2f)
                moveTo(11f, 2f)
                curveTo(9.04f, 2.18f, 7.19f, 2.95f, 5.67f, 4.2f)
                lineTo(7.1f, 5.74f)
                curveTo(8.22f, 4.84f, 9.57f, 4.26f, 11f, 4.06f)
                verticalLineTo(2f)
                moveTo(4.26f, 5.67f)
                curveTo(3f, 7.19f, 2.24f, 9.04f, 2.05f, 11f)
                horizontalLineTo(4.05f)
                curveTo(4.24f, 9.58f, 4.8f, 8.23f, 5.69f, 7.1f)
                lineTo(4.26f, 5.67f)
                moveTo(2.06f, 13f)
                curveTo(2.26f, 14.96f, 3.03f, 16.81f, 4.27f, 18.33f)
                lineTo(5.69f, 16.9f)
                curveTo(4.81f, 15.77f, 4.24f, 14.42f, 4.06f, 13f)
                horizontalLineTo(2.06f)
                moveTo(7.06f, 18.37f)
                lineTo(5.67f, 19.74f)
                curveTo(7.18f, 21f, 9.04f, 21.79f, 11f, 22f)
                verticalLineTo(20f)
                curveTo(9.58f, 19.82f, 8.23f, 19.25f, 7.1f, 18.37f)
                horizontalLineTo(7.06f)
                close()
            }
        }.build()

        return _ProgressHelper!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressHelper: ImageVector? = null
