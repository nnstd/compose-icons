package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GrillOutline: ImageVector
    get() {
        if (_GrillOutline != null) {
            return _GrillOutline!!
        }
        _GrillOutline = ImageVector.Builder(
            name = "GrillOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 22f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.18f, 18f)
                horizontalLineTo(9.14f)
                lineTo(11.13f, 14.94f)
                arcTo(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.87f, 14.94f)
                lineTo(13.89f, 16.5f)
                curveTo(14.31f, 16f, 14.85f, 15.56f, 15.5f, 15.3f)
                lineTo(14.89f, 14.37f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                horizontalLineTo(5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.12f, 14.37f)
                lineTo(5.17f, 20.45f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.84f, 21.54f)
                lineTo(7.84f, 20f)
                horizontalLineTo(14.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                moveTo(17f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19f)
                curveTo(18f, 19.55f, 17.55f, 20f, 17f, 20f)
                reflectiveCurveTo(16f, 19.55f, 16f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                moveTo(7.42f, 10f)
                horizontalLineTo(16.58f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.42f, 10f)
                moveTo(9.41f, 7f)
                horizontalLineTo(10.41f)
                curveTo(10.56f, 5.85f, 10.64f, 5.36f, 9.5f, 4.04f)
                curveTo(9.1f, 3.54f, 8.84f, 3.27f, 9.06f, 2f)
                horizontalLineTo(8.07f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.96f, 4.96f)
                curveTo(9.18f, 5.2f, 9.75f, 5.63f, 9.41f, 7f)
                moveTo(11.89f, 7f)
                horizontalLineTo(12.89f)
                curveTo(13.04f, 5.85f, 13.12f, 5.36f, 12f, 4.04f)
                curveTo(11.58f, 3.54f, 11.32f, 3.26f, 11.54f, 2f)
                horizontalLineTo(10.55f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.44f, 4.96f)
                curveTo(11.67f, 5.2f, 12.24f, 5.63f, 11.89f, 7f)
                moveTo(14.41f, 7f)
                horizontalLineTo(15.41f)
                curveTo(15.56f, 5.85f, 15.64f, 5.36f, 14.5f, 4.04f)
                curveTo(14.1f, 3.54f, 13.84f, 3.27f, 14.06f, 2f)
                horizontalLineTo(13.07f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.96f, 4.96f)
                curveTo(14.18f, 5.2f, 14.75f, 5.63f, 14.41f, 7f)
                close()
            }
        }.build()

        return _GrillOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GrillOutline: ImageVector? = null
