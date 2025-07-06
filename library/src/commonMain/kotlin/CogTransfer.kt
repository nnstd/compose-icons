package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CogTransfer: ImageVector
    get() {
        if (_CogTransfer != null) {
            return _CogTransfer!!
        }
        _CogTransfer = ImageVector.Builder(
            name = "CogTransfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18f)
                verticalLineTo(16f)
                lineTo(10f, 19.5f)
                lineTo(14f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                moveTo(22f, 15.5f)
                lineTo(18f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                lineTo(22f, 15.5f)
                moveTo(21.66f, 8.73f)
                lineTo(19.66f, 5.27f)
                curveTo(19.54f, 5.05f, 19.28f, 4.96f, 19.05f, 5.05f)
                lineTo(16.56f, 6.05f)
                curveTo(16.05f, 5.64f, 15.5f, 5.31f, 14.87f, 5.05f)
                lineTo(14.5f, 2.42f)
                curveTo(14.46f, 2.18f, 14.25f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(9.75f, 2f, 9.54f, 2.18f, 9.5f, 2.42f)
                lineTo(9.13f, 5.07f)
                curveTo(8.5f, 5.33f, 7.96f, 5.66f, 7.44f, 6.07f)
                lineTo(5f, 5.05f)
                curveTo(4.77f, 4.96f, 4.5f, 5.05f, 4.39f, 5.27f)
                lineTo(2.39f, 8.73f)
                curveTo(2.26f, 8.94f, 2.31f, 9.22f, 2.5f, 9.37f)
                lineTo(4.57f, 11f)
                curveTo(4.53f, 11.33f, 4.5f, 11.67f, 4.5f, 12f)
                curveTo(4.5f, 12.33f, 4.53f, 12.67f, 4.57f, 13f)
                lineTo(2.46f, 14.63f)
                curveTo(2.26f, 14.78f, 2.21f, 15.06f, 2.34f, 15.27f)
                lineTo(4.34f, 18.73f)
                curveTo(4.45f, 19f, 4.74f, 19.11f, 5f, 19f)
                lineTo(5f, 19f)
                lineTo(7.5f, 18f)
                curveTo(7.74f, 18.19f, 8f, 18.37f, 8.26f, 18.53f)
                lineTo(11.77f, 15.53f)
                curveTo(9.84f, 15.4f, 8.38f, 13.73f, 8.5f, 11.8f)
                curveTo(8.65f, 9.87f, 10.32f, 8.41f, 12.25f, 8.55f)
                curveTo(13.69f, 8.64f, 14.92f, 9.62f, 15.35f, 11f)
                horizontalLineTo(19.43f)
                lineTo(21.54f, 9.37f)
                curveTo(21.73f, 9.22f, 21.78f, 8.94f, 21.66f, 8.73f)
                close()
            }
        }.build()

        return _CogTransfer!!
    }

@Suppress("ObjectPropertyName")
private var _CogTransfer: ImageVector? = null
