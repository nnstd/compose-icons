package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Web: ImageVector
    get() {
        if (_Web != null) {
            return _Web!!
        }
        _Web = ImageVector.Builder(
            name = "Web",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.36f, 14f)
                curveTo(16.44f, 13.34f, 16.5f, 12.68f, 16.5f, 12f)
                curveTo(16.5f, 11.32f, 16.44f, 10.66f, 16.36f, 10f)
                horizontalLineTo(19.74f)
                curveTo(19.9f, 10.64f, 20f, 11.31f, 20f, 12f)
                curveTo(20f, 12.69f, 19.9f, 13.36f, 19.74f, 14f)
                moveTo(14.59f, 19.56f)
                curveTo(15.19f, 18.45f, 15.65f, 17.25f, 15.97f, 16f)
                horizontalLineTo(18.92f)
                curveTo(17.96f, 17.65f, 16.43f, 18.93f, 14.59f, 19.56f)
                moveTo(14.34f, 14f)
                horizontalLineTo(9.66f)
                curveTo(9.56f, 13.34f, 9.5f, 12.68f, 9.5f, 12f)
                curveTo(9.5f, 11.32f, 9.56f, 10.65f, 9.66f, 10f)
                horizontalLineTo(14.34f)
                curveTo(14.43f, 10.65f, 14.5f, 11.32f, 14.5f, 12f)
                curveTo(14.5f, 12.68f, 14.43f, 13.34f, 14.34f, 14f)
                moveTo(12f, 19.96f)
                curveTo(11.17f, 18.76f, 10.5f, 17.43f, 10.09f, 16f)
                horizontalLineTo(13.91f)
                curveTo(13.5f, 17.43f, 12.83f, 18.76f, 12f, 19.96f)
                moveTo(8f, 8f)
                horizontalLineTo(5.08f)
                curveTo(6.03f, 6.34f, 7.57f, 5.06f, 9.4f, 4.44f)
                curveTo(8.8f, 5.55f, 8.35f, 6.75f, 8f, 8f)
                moveTo(5.08f, 16f)
                horizontalLineTo(8f)
                curveTo(8.35f, 17.25f, 8.8f, 18.45f, 9.4f, 19.56f)
                curveTo(7.57f, 18.93f, 6.03f, 17.65f, 5.08f, 16f)
                moveTo(4.26f, 14f)
                curveTo(4.1f, 13.36f, 4f, 12.69f, 4f, 12f)
                curveTo(4f, 11.31f, 4.1f, 10.64f, 4.26f, 10f)
                horizontalLineTo(7.64f)
                curveTo(7.56f, 10.66f, 7.5f, 11.32f, 7.5f, 12f)
                curveTo(7.5f, 12.68f, 7.56f, 13.34f, 7.64f, 14f)
                moveTo(12f, 4.03f)
                curveTo(12.83f, 5.23f, 13.5f, 6.57f, 13.91f, 8f)
                horizontalLineTo(10.09f)
                curveTo(10.5f, 6.57f, 11.17f, 5.23f, 12f, 4.03f)
                moveTo(18.92f, 8f)
                horizontalLineTo(15.97f)
                curveTo(15.65f, 6.75f, 15.19f, 5.55f, 14.59f, 4.44f)
                curveTo(16.43f, 5.07f, 17.96f, 6.34f, 18.92f, 8f)
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _Web!!
    }

@Suppress("ObjectPropertyName")
private var _Web: ImageVector? = null
