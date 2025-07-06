package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskEmptyRemoveOutline: ImageVector
    get() {
        if (_FlaskEmptyRemoveOutline != null) {
            return _FlaskEmptyRemoveOutline!!
        }
        _FlaskEmptyRemoveOutline = ImageVector.Builder(
            name = "FlaskEmptyRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.46f, 15.88f)
                lineTo(16.88f, 14.46f)
                lineTo(19f, 16.59f)
                lineTo(21.12f, 14.47f)
                lineTo(22.53f, 15.88f)
                lineTo(20.41f, 18f)
                lineTo(22.54f, 20.12f)
                lineTo(21.12f, 21.54f)
                lineTo(19f, 19.41f)
                lineTo(16.88f, 21.53f)
                lineTo(15.47f, 20.12f)
                lineTo(17.59f, 18f)
                lineTo(15.46f, 15.88f)
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
                close()
            }
        }.build()

        return _FlaskEmptyRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskEmptyRemoveOutline: ImageVector? = null
