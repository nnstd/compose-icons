package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompassOffOutline: ImageVector
    get() {
        if (_CompassOffOutline != null) {
            return _CompassOffOutline!!
        }
        _CompassOffOutline = ImageVector.Builder(
            name = "CompassOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 3.5f)
                lineTo(2.28f, 2.25f)
                lineTo(21.75f, 21.72f)
                lineTo(20.5f, 23f)
                lineTo(17.7f, 20.22f)
                curveTo(16.08f, 21.34f, 14.12f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2f, 9.88f, 2.66f, 7.92f, 3.78f, 6.3f)
                lineTo(1f, 3.5f)
                moveTo(7f, 17f)
                lineTo(9.39f, 11.91f)
                lineTo(5.23f, 7.74f)
                curveTo(4.45f, 9f, 4f, 10.44f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                curveTo(13.56f, 20f, 15f, 19.55f, 16.26f, 18.77f)
                lineTo(12.09f, 14.61f)
                lineTo(7f, 17f)
                moveTo(17f, 7f)
                lineTo(14.62f, 12.05f)
                lineTo(11.95f, 9.38f)
                lineTo(17f, 7f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                curveTo(22f, 14.1f, 21.35f, 16.06f, 20.24f, 17.67f)
                lineTo(18.8f, 16.22f)
                curveTo(19.56f, 15f, 20f, 13.55f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                curveTo(10.45f, 4f, 9f, 4.44f, 7.78f, 5.2f)
                lineTo(6.33f, 3.76f)
                curveTo(7.94f, 2.65f, 9.9f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _CompassOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CompassOffOutline: ImageVector? = null
