package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorCurve: ImageVector
    get() {
        if (_VectorCurve != null) {
            return _VectorCurve!!
        }
        _VectorCurve = ImageVector.Builder(
            name = "VectorCurve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 5f)
                curveTo(18.27f, 5f, 18.05f, 4.95f, 17.85f, 4.85f)
                lineTo(14.16f, 8.55f)
                lineTo(14.5f, 9f)
                curveTo(16.69f, 7.74f, 19.26f, 7f, 22f, 7f)
                lineTo(23f, 7.03f)
                verticalLineTo(9.04f)
                lineTo(22f, 9f)
                curveTo(19.42f, 9f, 17f, 9.75f, 15f, 11.04f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.04f, 15f)
                curveTo(9.75f, 17f, 9f, 19.42f, 9f, 22f)
                lineTo(9.04f, 23f)
                horizontalLineTo(7.03f)
                lineTo(7f, 22f)
                curveTo(7f, 19.26f, 7.74f, 16.69f, 9f, 14.5f)
                lineTo(8.55f, 14.16f)
                lineTo(4.85f, 17.85f)
                curveTo(4.95f, 18.05f, 5f, 18.27f, 5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 17f)
                curveTo(3.73f, 17f, 3.95f, 17.05f, 4.15f, 17.15f)
                lineTo(7.84f, 13.45f)
                curveTo(7.31f, 12.78f, 7f, 11.92f, 7f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                curveTo(11.92f, 7f, 12.78f, 7.31f, 13.45f, 7.84f)
                lineTo(17.15f, 4.15f)
                curveTo(17.05f, 3.95f, 17f, 3.73f, 17f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 2f)
                moveTo(11f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                close()
            }
        }.build()

        return _VectorCurve!!
    }

@Suppress("ObjectPropertyName")
private var _VectorCurve: ImageVector? = null
