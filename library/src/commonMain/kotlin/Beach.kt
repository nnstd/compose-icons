package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Beach: ImageVector
    get() {
        if (_Beach != null) {
            return _Beach!!
        }
        _Beach = ImageVector.Builder(
            name = "Beach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18.54f)
                curveTo(17.13f, 18.21f, 19.5f, 18f, 22f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                curveTo(5f, 21.35f, 8.2f, 19.86f, 13f, 18.9f)
                verticalLineTo(12.4f)
                curveTo(12.16f, 12.65f, 11.45f, 13.21f, 11f, 13.95f)
                curveTo(10.39f, 12.93f, 9.27f, 12.25f, 8f, 12.25f)
                curveTo(6.73f, 12.25f, 5.61f, 12.93f, 5f, 13.95f)
                curveTo(5.03f, 10.37f, 8.5f, 7.43f, 13f, 7.04f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7f)
                verticalLineTo(7.04f)
                curveTo(19.5f, 7.43f, 22.96f, 10.37f, 23f, 13.95f)
                curveTo(22.39f, 12.93f, 21.27f, 12.25f, 20f, 12.25f)
                curveTo(18.73f, 12.25f, 17.61f, 12.93f, 17f, 13.95f)
                curveTo(16.55f, 13.21f, 15.84f, 12.65f, 15f, 12.39f)
                verticalLineTo(18.54f)
                moveTo(7f, 2f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 7f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Beach!!
    }

@Suppress("ObjectPropertyName")
private var _Beach: ImageVector? = null
