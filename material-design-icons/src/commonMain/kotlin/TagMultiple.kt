package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagMultiple: ImageVector
    get() {
        if (_TagMultiple != null) {
            return _TagMultiple!!
        }
        _TagMultiple = ImageVector.Builder(
            name = "TagMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 9f)
                moveTo(17.41f, 11.58f)
                curveTo(17.77f, 11.94f, 18f, 12.44f, 18f, 13f)
                curveTo(18f, 13.55f, 17.78f, 14.05f, 17.41f, 14.41f)
                lineTo(12.41f, 19.41f)
                curveTo(12.05f, 19.77f, 11.55f, 20f, 11f, 20f)
                curveTo(10.45f, 20f, 9.95f, 19.78f, 9.58f, 19.41f)
                lineTo(2.59f, 12.42f)
                curveTo(2.22f, 12.05f, 2f, 11.55f, 2f, 11f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(9f)
                curveTo(9.55f, 4f, 10.05f, 4.22f, 10.41f, 4.58f)
                lineTo(17.41f, 11.58f)
                moveTo(13.54f, 5.71f)
                lineTo(14.54f, 4.71f)
                lineTo(21.41f, 11.58f)
                curveTo(21.78f, 11.94f, 22f, 12.45f, 22f, 13f)
                curveTo(22f, 13.55f, 21.78f, 14.05f, 21.42f, 14.41f)
                lineTo(16.04f, 19.79f)
                lineTo(15.04f, 18.79f)
                lineTo(20.75f, 13f)
                lineTo(13.54f, 5.71f)
                close()
            }
        }.build()

        return _TagMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _TagMultiple: ImageVector? = null
