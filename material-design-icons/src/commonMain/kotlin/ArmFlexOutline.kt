package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArmFlexOutline: ImageVector
    get() {
        if (_ArmFlexOutline != null) {
            return _ArmFlexOutline!!
        }
        _ArmFlexOutline = ImageVector.Builder(
            name = "ArmFlexOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7.76f)
                verticalLineTo(16.25f)
                horizontalLineTo(11.08f)
                lineTo(11.68f, 15.34f)
                curveTo(12.84f, 13.55f, 14.93f, 12.75f, 16.47f, 12.75f)
                curveTo(17f, 12.75f, 17.45f, 12.84f, 17.79f, 13f)
                curveTo(18.7f, 13.41f, 18.95f, 14.18f, 19f, 14.74f)
                curveTo(19.08f, 15.87f, 18.5f, 17.03f, 17.5f, 17.71f)
                curveTo(16.6f, 18.33f, 14.44f, 19f, 11.87f, 19f)
                curveTo(10.12f, 19f, 7.61f, 18.69f, 5.12f, 17.3f)
                curveTo(5.41f, 14.85f, 6f, 10.88f, 7f, 7.76f)
                moveTo(7f, 3f)
                curveTo(4f, 7.09f, 3f, 18.34f, 3f, 18.34f)
                curveTo(5.9f, 20.31f, 9.08f, 21f, 11.87f, 21f)
                curveTo(14.86f, 21f, 17.39f, 20.21f, 18.64f, 19.36f)
                curveTo(21.64f, 17.32f, 21.94f, 12.71f, 18.64f, 11.18f)
                curveTo(18f, 10.89f, 17.26f, 10.75f, 16.47f, 10.75f)
                curveTo(14.17f, 10.75f, 11.5f, 11.96f, 10f, 14.25f)
                horizontalLineTo(9f)
                verticalLineTo(7.09f)
                horizontalLineTo(11f)
                lineTo(12f, 4f)
                lineTo(7f, 3f)
                close()
            }
        }.build()

        return _ArmFlexOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArmFlexOutline: ImageVector? = null
