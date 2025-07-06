package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskMinusOutline: ImageVector
    get() {
        if (_FlaskMinusOutline != null) {
            return _FlaskMinusOutline!!
        }
        _FlaskMinusOutline = ImageVector.Builder(
            name = "FlaskMinusOutline",
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
                moveTo(5f, 19f)
                curveTo(5f, 19.55f, 5.45f, 20f, 6f, 20f)
                horizontalLineTo(13.34f)
                curveTo(13.61f, 20.75f, 14f, 21.42f, 14.53f, 22f)
                horizontalLineTo(6f)
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
                curveTo(16.86f, 12.35f, 16.24f, 12.63f, 15.69f, 13f)
                lineTo(13f, 8.35f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(8.35f)
                lineTo(5.18f, 18.43f)
                curveTo(5.07f, 18.59f, 5f, 18.79f, 5f, 19f)
                moveTo(13f, 16f)
                lineTo(13.58f, 15.42f)
                curveTo(13.21f, 16.2f, 13f, 17.08f, 13f, 18f)
                horizontalLineTo(7.73f)
                lineTo(10.39f, 13.39f)
                lineTo(13f, 16f)
                moveTo(12.5f, 12f)
                curveTo(12.78f, 12f, 13f, 12.22f, 13f, 12.5f)
                curveTo(13f, 12.78f, 12.78f, 13f, 12.5f, 13f)
                curveTo(12.22f, 13f, 12f, 12.78f, 12f, 12.5f)
                curveTo(12f, 12.22f, 12.22f, 12f, 12.5f, 12f)
                close()
            }
        }.build()

        return _FlaskMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskMinusOutline: ImageVector? = null
