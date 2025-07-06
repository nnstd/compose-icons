package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GhostOffOutline: ImageVector
    get() {
        if (_GhostOffOutline != null) {
            return _GhostOffOutline!!
        }
        _GhostOffOutline = ImageVector.Builder(
            name = "GhostOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.29f, 5.09f)
                lineTo(6.84f, 3.64f)
                curveTo(8.3f, 2.61f, 10.08f, 2f, 12f, 2f)
                curveTo(16.97f, 2f, 21f, 6.03f, 21f, 11f)
                verticalLineTo(17.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(11f)
                curveTo(19f, 7.14f, 15.86f, 4f, 12f, 4f)
                curveTo(10.63f, 4f, 9.36f, 4.4f, 8.29f, 5.09f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.56f, 19.45f)
                lineTo(15f, 22f)
                lineTo(12f, 19f)
                lineTo(9f, 22f)
                lineTo(6f, 19f)
                lineTo(3f, 22f)
                verticalLineTo(11f)
                curveTo(3f, 9.26f, 3.5f, 7.63f, 4.36f, 6.25f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(6.89f, 6.23f)
                lineTo(8.69f, 8.03f)
                horizontalLineTo(8.69f)
                lineTo(10.97f, 10.31f)
                verticalLineTo(10.31f)
                lineTo(17.41f, 16.76f)
                lineTo(17.42f, 16.76f)
                lineTo(21f, 20.34f)
                verticalLineTo(20.35f)
                lineTo(22.11f, 21.46f)
                moveTo(16.14f, 18.03f)
                lineTo(9.89f, 11.78f)
                curveTo(9.62f, 11.92f, 9.32f, 12f, 9f, 12f)
                curveTo(7.9f, 12f, 7f, 11.11f, 7f, 10f)
                curveTo(7f, 9.68f, 7.08f, 9.38f, 7.22f, 9.11f)
                lineTo(5.82f, 7.71f)
                curveTo(5.3f, 8.69f, 5f, 9.81f, 5f, 11f)
                verticalLineTo(17.17f)
                lineTo(6f, 16.17f)
                lineTo(7.41f, 17.59f)
                lineTo(9f, 19.17f)
                lineTo(10.59f, 17.59f)
                lineTo(12f, 16.17f)
                lineTo(13.41f, 17.59f)
                lineTo(15f, 19.17f)
                lineTo(16.14f, 18.03f)
                moveTo(15f, 8f)
                curveTo(13.96f, 8f, 13.11f, 8.8f, 13f, 9.82f)
                lineTo(15.18f, 12f)
                curveTo(16.2f, 11.89f, 17f, 11.04f, 17f, 10f)
                curveTo(17f, 8.9f, 16.11f, 8f, 15f, 8f)
                close()
            }
        }.build()

        return _GhostOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GhostOffOutline: ImageVector? = null
