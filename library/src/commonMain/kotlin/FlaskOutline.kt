package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskOutline: ImageVector
    get() {
        if (_FlaskOutline != null) {
            return _FlaskOutline!!
        }
        _FlaskOutline = ImageVector.Builder(
            name = "FlaskOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                curveTo(19f, 18.79f, 18.93f, 18.59f, 18.82f, 18.43f)
                lineTo(13f, 8.35f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(8.35f)
                lineTo(5.18f, 18.43f)
                curveTo(5.07f, 18.59f, 5f, 18.79f, 5f, 19f)
                moveTo(6f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                curveTo(3f, 18.4f, 3.18f, 17.84f, 3.5f, 17.37f)
                lineTo(9f, 7.81f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6f)
                verticalLineTo(7.81f)
                lineTo(20.5f, 17.37f)
                curveTo(20.82f, 17.84f, 21f, 18.4f, 21f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                moveTo(13f, 16f)
                lineTo(14.34f, 14.66f)
                lineTo(16.27f, 18f)
                horizontalLineTo(7.73f)
                lineTo(10.39f, 13.39f)
                lineTo(13f, 16f)
                moveTo(12.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 13f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 12f)
                close()
            }
        }.build()

        return _FlaskOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskOutline: ImageVector? = null
