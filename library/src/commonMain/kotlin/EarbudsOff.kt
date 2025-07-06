package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarbudsOff: ImageVector
    get() {
        if (_EarbudsOff != null) {
            return _EarbudsOff!!
        }
        _EarbudsOff = ImageVector.Builder(
            name = "EarbudsOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9.34f)
                verticalLineTo(9.34f)
                lineTo(11.56f, 10.91f)
                lineTo(11.56f, 10.9f)
                lineTo(14.1f, 13.45f)
                lineTo(14.09f, 13.44f)
                lineTo(15.58f, 14.93f)
                lineTo(15.59f, 14.93f)
                lineTo(18.5f, 17.84f)
                verticalLineTo(17.85f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.43f, 20.33f)
                curveTo(18.3f, 20.72f, 17.94f, 21f, 17.5f, 21f)
                horizontalLineTo(15.5f)
                curveTo(14.95f, 21f, 14.5f, 20.55f, 14.5f, 20f)
                verticalLineTo(16.39f)
                lineTo(10f, 11.89f)
                verticalLineTo(20f)
                curveTo(10f, 20.55f, 9.55f, 21f, 9f, 21f)
                horizontalLineTo(8f)
                curveTo(7.45f, 21f, 7f, 20.55f, 7f, 20f)
                verticalLineTo(13.27f)
                curveTo(6.32f, 13.72f, 5.61f, 14f, 5f, 14f)
                curveTo(3f, 14f, 2f, 12f, 2f, 11f)
                verticalLineTo(6f)
                curveTo(2f, 5.58f, 2.19f, 5f, 2.55f, 4.43f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(6.1f, 5.44f)
                moveTo(22f, 8.5f)
                curveTo(22f, 5.46f, 19.54f, 3f, 16.5f, 3f)
                curveTo(13.69f, 3f, 11.37f, 5.12f, 11.04f, 7.84f)
                lineTo(17.16f, 13.96f)
                curveTo(19.89f, 13.63f, 22f, 11.32f, 22f, 8.5f)
                close()
            }
        }.build()

        return _EarbudsOff!!
    }

@Suppress("ObjectPropertyName")
private var _EarbudsOff: ImageVector? = null
