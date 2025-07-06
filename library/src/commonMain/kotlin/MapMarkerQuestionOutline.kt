package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerQuestionOutline: ImageVector
    get() {
        if (_MapMarkerQuestionOutline != null) {
            return _MapMarkerQuestionOutline!!
        }
        _MapMarkerQuestionOutline = ImageVector.Builder(
            name = "MapMarkerQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(7.59f, 1f, 4f, 4.59f, 4f, 9f)
                curveTo(4f, 14.57f, 10.96f, 22.34f, 11.26f, 22.67f)
                lineTo(12f, 23.5f)
                lineTo(12.74f, 22.67f)
                curveTo(13.04f, 22.34f, 20f, 14.57f, 20f, 9f)
                curveTo(20f, 4.59f, 16.41f, 1f, 12f, 1f)
                moveTo(12f, 20.47f)
                curveTo(9.82f, 17.86f, 6f, 12.54f, 6f, 9f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                curveTo(18f, 12.83f, 13.75f, 18.36f, 12f, 20.47f)
                moveTo(11.13f, 14f)
                horizontalLineTo(12.88f)
                verticalLineTo(15.75f)
                horizontalLineTo(11.13f)
                moveTo(12f, 5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 8.5f)
                horizontalLineTo(10.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.75f, 8.5f)
                curveTo(13.75f, 10.26f, 11.13f, 10.04f, 11.13f, 12.88f)
                horizontalLineTo(12.88f)
                curveTo(12.88f, 10.91f, 15.5f, 10.69f, 15.5f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                close()
            }
        }.build()

        return _MapMarkerQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerQuestionOutline: ImageVector? = null
