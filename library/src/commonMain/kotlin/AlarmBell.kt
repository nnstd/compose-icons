package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmBell: ImageVector
    get() {
        if (_AlarmBell != null) {
            return _AlarmBell!!
        }
        _AlarmBell = ImageVector.Builder(
            name = "AlarmBell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18.66f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(18.66f)
                curveTo(8.09f, 20.45f, 11.91f, 20.45f, 15f, 18.66f)
                moveTo(22f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                curveTo(19.69f, 2f, 19.39f, 2.07f, 19.12f, 2.21f)
                curveTo(18.82f, 2.36f, 18.56f, 2.58f, 18.36f, 2.85f)
                curveTo(17.72f, 3.75f, 17.94f, 5f, 18.85f, 5.64f)
                curveTo(19.18f, 5.87f, 19.59f, 6f, 20f, 6f)
                curveTo(20.08f, 6f, 20.16f, 6f, 20.24f, 6f)
                curveTo(21.97f, 10.43f, 20.66f, 15.46f, 17f, 18.5f)
                curveTo(16.68f, 18.75f, 16.35f, 19f, 16f, 19.22f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19.74f)
                curveTo(20.14f, 17.5f, 22f, 13.86f, 22f, 10f)
                curveTo(22f, 8.5f, 21.72f, 7f, 21.17f, 5.62f)
                curveTo(21.69f, 5.24f, 22f, 4.64f, 22f, 4f)
                moveTo(18f, 10f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                close()
            }
        }.build()

        return _AlarmBell!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmBell: ImageVector? = null
