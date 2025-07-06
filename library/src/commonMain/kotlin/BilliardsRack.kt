package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BilliardsRack: ImageVector
    get() {
        if (_BilliardsRack != null) {
            return _BilliardsRack!!
        }
        _BilliardsRack = ImageVector.Builder(
            name = "BilliardsRack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.31f, 16.44f)
                lineTo(14.54f, 6.47f)
                curveTo(13.72f, 5.04f, 11.89f, 4.55f, 10.46f, 5.38f)
                curveTo(10f, 5.64f, 9.63f, 6f, 9.36f, 6.47f)
                lineTo(3.6f, 16.44f)
                curveTo(2.77f, 17.87f, 3.26f, 19.69f, 4.69f, 20.5f)
                curveTo(5.14f, 20.78f, 5.65f, 20.92f, 6.18f, 20.92f)
                horizontalLineTo(17.73f)
                curveTo(19.38f, 20.91f, 20.72f, 19.57f, 20.71f, 17.92f)
                curveTo(20.71f, 17.4f, 20.57f, 16.89f, 20.31f, 16.44f)
                moveTo(5.37f, 17.43f)
                lineTo(11.11f, 7.47f)
                curveTo(11.38f, 7f, 12f, 6.82f, 12.46f, 7.1f)
                curveTo(12.62f, 7.18f, 12.75f, 7.31f, 12.84f, 7.47f)
                lineTo(18.58f, 17.43f)
                curveTo(18.85f, 17.91f, 18.69f, 18.5f, 18.21f, 18.79f)
                curveTo(18.06f, 18.88f, 17.89f, 18.93f, 17.72f, 18.93f)
                horizontalLineTo(6.21f)
                curveTo(5.66f, 18.92f, 5.21f, 18.47f, 5.22f, 17.92f)
                curveTo(5.22f, 17.75f, 5.26f, 17.58f, 5.35f, 17.43f)
                horizontalLineTo(5.37f)
                moveTo(11.97f, 13.45f)
                curveTo(10.87f, 13.45f, 10f, 12.56f, 10f, 11.46f)
                curveTo(10f, 10.35f, 10.87f, 9.46f, 11.97f, 9.46f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.97f, 11.46f)
                curveTo(13.97f, 12.56f, 13.07f, 13.45f, 11.95f, 13.45f)
                horizontalLineTo(11.97f)
                moveTo(9.46f, 17.93f)
                curveTo(8.36f, 17.93f, 7.47f, 17.04f, 7.47f, 15.94f)
                curveTo(7.47f, 14.84f, 8.36f, 13.95f, 9.46f, 13.95f)
                curveTo(10.56f, 13.95f, 11.46f, 14.84f, 11.46f, 15.94f)
                curveTo(11.46f, 17.04f, 10.56f, 17.93f, 9.46f, 17.93f)
                moveTo(14.44f, 17.93f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.45f, 15.94f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.44f, 13.95f)
                curveTo(15.54f, 13.95f, 16.44f, 14.84f, 16.44f, 15.94f)
                curveTo(16.44f, 17.04f, 15.54f, 17.93f, 14.44f, 17.93f)
                close()
            }
        }.build()

        return _BilliardsRack!!
    }

@Suppress("ObjectPropertyName")
private var _BilliardsRack: ImageVector? = null
