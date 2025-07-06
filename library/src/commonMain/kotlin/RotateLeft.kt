package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RotateLeft: ImageVector
    get() {
        if (_RotateLeft != null) {
            return _RotateLeft!!
        }
        _RotateLeft = ImageVector.Builder(
            name = "RotateLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4.07f)
                verticalLineTo(1f)
                lineTo(8.45f, 5.55f)
                lineTo(13f, 10f)
                verticalLineTo(6.09f)
                curveTo(15.84f, 6.57f, 18f, 9.03f, 18f, 12f)
                curveTo(18f, 14.97f, 15.84f, 17.43f, 13f, 17.91f)
                verticalLineTo(19.93f)
                curveTo(16.95f, 19.44f, 20f, 16.08f, 20f, 12f)
                curveTo(20f, 7.92f, 16.95f, 4.56f, 13f, 4.07f)
                moveTo(7.1f, 18.32f)
                curveTo(8.26f, 19.22f, 9.61f, 19.76f, 11f, 19.93f)
                verticalLineTo(17.9f)
                curveTo(10.13f, 17.75f, 9.29f, 17.41f, 8.54f, 16.87f)
                lineTo(7.1f, 18.32f)
                moveTo(6.09f, 13f)
                horizontalLineTo(4.07f)
                curveTo(4.24f, 14.39f, 4.79f, 15.73f, 5.69f, 16.89f)
                lineTo(7.1f, 15.47f)
                curveTo(6.58f, 14.72f, 6.23f, 13.88f, 6.09f, 13f)
                moveTo(7.11f, 8.53f)
                lineTo(5.7f, 7.11f)
                curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11f)
                horizontalLineTo(6.09f)
                curveTo(6.23f, 10.13f, 6.58f, 9.28f, 7.11f, 8.53f)
                close()
            }
        }.build()

        return _RotateLeft!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft: ImageVector? = null
