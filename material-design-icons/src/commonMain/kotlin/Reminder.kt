package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Reminder: ImageVector
    get() {
        if (_Reminder != null) {
            return _Reminder!!
        }
        _Reminder = ImageVector.Builder(
            name = "Reminder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.25f, 3f)
                curveTo(7.9f, 3f, 8.5f, 3.21f, 9f, 3.56f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 3f)
                verticalLineTo(3.57f)
                curveTo(13.5f, 3.22f, 14.1f, 3f, 14.75f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 6f)
                curveTo(17.75f, 7.58f, 16.54f, 8.87f, 15f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(14.24f)
                lineTo(14.72f, 10.13f)
                lineTo(19.31f, 12.42f)
                curveTo(20.13f, 12.73f, 20.53f, 13.34f, 20.53f, 14.25f)
                lineTo(20.5f, 14.39f)
                verticalLineTo(14.53f)
                lineTo(19.5f, 21.28f)
                curveTo(19.44f, 21.75f, 19.22f, 22.16f, 18.84f, 22.5f)
                curveTo(18.47f, 22.84f, 18.05f, 23f, 17.58f, 23f)
                horizontalLineTo(10f)
                curveTo(9.45f, 23f, 9f, 22.81f, 8.58f, 22.41f)
                lineTo(2f, 15.84f)
                lineTo(3.05f, 14.77f)
                curveTo(3.33f, 14.5f, 3.69f, 14.34f, 4.13f, 14.34f)
                horizontalLineTo(4.45f)
                lineTo(9f, 15.33f)
                verticalLineTo(10f)
                lineTo(9f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                curveTo(5.46f, 8.86f, 4.25f, 7.57f, 4.25f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, 3f)
                moveTo(9f, 6f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.25f, 4.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 6f)
                curveTo(5.5f, 6.88f, 6.15f, 7.61f, 7f, 7.73f)
                verticalLineTo(7.75f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(15f, 7.75f)
                verticalLineTo(7.74f)
                curveTo(15.85f, 7.62f, 16.5f, 6.89f, 16.5f, 6f)
                curveTo(16.5f, 5.04f, 15.72f, 4.26f, 14.75f, 4.26f)
                curveTo(13.78f, 4.26f, 13f, 5.04f, 13f, 6f)
                verticalLineTo(7.75f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _Reminder!!
    }

@Suppress("ObjectPropertyName")
private var _Reminder: ImageVector? = null
