package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskMinus: ImageVector
    get() {
        if (_FlaskMinus != null) {
            return _FlaskMinus!!
        }
        _FlaskMinus = ImageVector.Builder(
            name = "FlaskMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                moveTo(6f, 22f)
                curveTo(4.34f, 22f, 3f, 20.66f, 3f, 19f)
                curveTo(3f, 18.4f, 3.18f, 17.84f, 3.5f, 17.36f)
                lineTo(9f, 7.81f)
                verticalLineTo(6f)
                curveTo(8.45f, 6f, 8f, 5.55f, 8f, 5f)
                verticalLineTo(4f)
                curveTo(8f, 2.9f, 8.9f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.11f, 2f, 16f, 2.9f, 16f, 4f)
                verticalLineTo(5f)
                curveTo(16f, 5.55f, 15.55f, 6f, 15f, 6f)
                verticalLineTo(7.81f)
                lineTo(17.5f, 12.18f)
                curveTo(15.5f, 12.7f, 13.86f, 14.26f, 13.26f, 16.26f)
                lineTo(8.93f, 11.93f)
                lineTo(5.18f, 18.43f)
                curveTo(5.07f, 18.59f, 5f, 18.79f, 5f, 19f)
                curveTo(5f, 19.55f, 5.45f, 20f, 6f, 20f)
                horizontalLineTo(13.34f)
                curveTo(13.61f, 20.75f, 14f, 21.42f, 14.53f, 22f)
                horizontalLineTo(6f)
                moveTo(13f, 10f)
                curveTo(12.45f, 10f, 12f, 10.45f, 12f, 11f)
                curveTo(12f, 11.55f, 12.45f, 12f, 13f, 12f)
                curveTo(13.55f, 12f, 14f, 11.55f, 14f, 11f)
                curveTo(14f, 10.45f, 13.55f, 10f, 13f, 10f)
                close()
            }
        }.build()

        return _FlaskMinus!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskMinus: ImageVector? = null
