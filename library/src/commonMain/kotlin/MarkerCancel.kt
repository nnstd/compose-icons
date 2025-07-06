package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MarkerCancel: ImageVector
    get() {
        if (_MarkerCancel != null) {
            return _MarkerCancel!!
        }
        _MarkerCancel = ImageVector.Builder(
            name = "MarkerCancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 13f)
                curveTo(20f, 13f, 22f, 15f, 22f, 17.5f)
                curveTo(22f, 20f, 20f, 22f, 17.5f, 22f)
                curveTo(15f, 22f, 13f, 20f, 13f, 17.5f)
                curveTo(13f, 15f, 15f, 13f, 17.5f, 13f)
                moveTo(17.5f, 14.5f)
                curveTo(16.94f, 14.5f, 16.42f, 14.65f, 16f, 14.92f)
                lineTo(20.08f, 19f)
                curveTo(20.35f, 18.58f, 20.5f, 18.06f, 20.5f, 17.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 14.5f)
                moveTo(14.5f, 17.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 20.5f)
                curveTo(18.06f, 20.5f, 18.58f, 20.35f, 19f, 20.08f)
                lineTo(14.92f, 16f)
                curveTo(14.65f, 16.42f, 14.5f, 16.94f, 14.5f, 17.5f)
                moveTo(18.5f, 1.15f)
                curveTo(19f, 1.15f, 19.5f, 1.34f, 19.89f, 1.73f)
                lineTo(22.73f, 4.56f)
                curveTo(23.5f, 5.35f, 23.5f, 6.61f, 22.73f, 7.39f)
                lineTo(18.95f, 11.16f)
                curveTo(18.5f, 11.06f, 18f, 11f, 17.5f, 11f)
                curveTo(16.67f, 11f, 15.88f, 11.16f, 15.15f, 11.44f)
                lineTo(11.26f, 7.55f)
                lineTo(17.07f, 1.73f)
                curveTo(17.46f, 1.34f, 17.97f, 1.15f, 18.5f, 1.15f)
                moveTo(10.3f, 8.5f)
                lineTo(13.89f, 12.1f)
                curveTo(12.15f, 13.26f, 11f, 15.25f, 11f, 17.5f)
                curveTo(11f, 18f, 11.06f, 18.5f, 11.16f, 18.95f)
                lineTo(10f, 20.12f)
                curveTo(9.22f, 20.89f, 7.97f, 20.9f, 7.19f, 20.14f)
                lineTo(6.33f, 21f)
                horizontalLineTo(0.67f)
                lineTo(4.36f, 17.31f)
                curveTo(3.56f, 16.5f, 3.56f, 15.24f, 4.34f, 14.46f)
                lineTo(10.3f, 8.5f)
                close()
            }
        }.build()

        return _MarkerCancel!!
    }

@Suppress("ObjectPropertyName")
private var _MarkerCancel: ImageVector? = null
