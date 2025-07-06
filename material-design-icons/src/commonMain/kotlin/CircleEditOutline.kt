package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleEditOutline: ImageVector
    get() {
        if (_CircleEditOutline != null) {
            return _CircleEditOutline!!
        }
        _CircleEditOutline = ImageVector.Builder(
            name = "CircleEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                horizontalLineTo(20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                verticalLineTo(2f)
                moveTo(18.78f, 3f)
                curveTo(18.61f, 3f, 18.43f, 3.07f, 18.3f, 3.2f)
                lineTo(17.08f, 4.41f)
                lineTo(19.58f, 6.91f)
                lineTo(20.8f, 5.7f)
                curveTo(21.06f, 5.44f, 21.06f, 5f, 20.8f, 4.75f)
                lineTo(19.25f, 3.2f)
                curveTo(19.12f, 3.07f, 18.95f, 3f, 18.78f, 3f)
                moveTo(16.37f, 5.12f)
                lineTo(9f, 12.5f)
                verticalLineTo(15f)
                horizontalLineTo(11.5f)
                lineTo(18.87f, 7.62f)
                lineTo(16.37f, 5.12f)
                close()
            }
        }.build()

        return _CircleEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CircleEditOutline: ImageVector? = null
