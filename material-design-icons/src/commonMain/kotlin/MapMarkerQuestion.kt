package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerQuestion: ImageVector
    get() {
        if (_MapMarkerQuestion != null) {
            return _MapMarkerQuestion!!
        }
        _MapMarkerQuestion = ImageVector.Builder(
            name = "MapMarkerQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveTo(5f, 14.25f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 19f, 14.25f, 19f, 9f)
                curveTo(19f, 5.14f, 15.86f, 2f, 12f, 2f)
                moveTo(12.88f, 15.75f)
                horizontalLineTo(11.13f)
                verticalLineTo(14f)
                horizontalLineTo(12.88f)
                moveTo(12.88f, 12.88f)
                horizontalLineTo(11.13f)
                curveTo(11.13f, 10.04f, 13.75f, 10.26f, 13.75f, 8.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 8.5f)
                horizontalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 8.5f)
                curveTo(15.5f, 10.69f, 12.88f, 10.91f, 12.88f, 12.88f)
                close()
            }
        }.build()

        return _MapMarkerQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerQuestion: ImageVector? = null
