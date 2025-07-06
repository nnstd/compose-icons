package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoKartTrack: ImageVector
    get() {
        if (_GoKartTrack != null) {
            return _GoKartTrack!!
        }
        _GoKartTrack = ImageVector.Builder(
            name = "GoKartTrack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 2f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5.5f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                curveTo(10f, 9f, 9f, 6f, 6f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                curveTo(6.86f, 8f, 7.42f, 8.45f, 8.32f, 9.24f)
                curveTo(9.28f, 10.27f, 10.6f, 10.9f, 12f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 6f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.5f)
                curveTo(19.86f, 6.35f, 19.58f, 7.18f, 19.17f, 7.94f)
                curveTo(18.5f, 9.2f, 18.11f, 10.58f, 18f, 12f)
                curveTo(18.09f, 13.37f, 18.5f, 14.71f, 19.21f, 15.89f)
                curveTo(19.6f, 16.54f, 19.87f, 17.25f, 20f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.25f, 14.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 18f)
                verticalLineTo(18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 22f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 18.5f)
                verticalLineTo(18f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.25f, 16.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                curveTo(22f, 16f, 20f, 14f, 20f, 12f)
                curveTo(20f, 10f, 22f, 7.5f, 22f, 5.5f)
                close()
            }
        }.build()

        return _GoKartTrack!!
    }

@Suppress("ObjectPropertyName")
private var _GoKartTrack: ImageVector? = null
