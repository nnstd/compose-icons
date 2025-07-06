package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Remote: ImageVector
    get() {
        if (_Remote != null) {
            return _Remote!!
        }
        _Remote = ImageVector.Builder(
            name = "Remote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(8.96f, 0f, 6.21f, 1.23f, 4.22f, 3.22f)
                lineTo(5.63f, 4.63f)
                curveTo(7.26f, 3f, 9.5f, 2f, 12f, 2f)
                curveTo(14.5f, 2f, 16.74f, 3f, 18.36f, 4.64f)
                lineTo(19.77f, 3.23f)
                curveTo(17.79f, 1.23f, 15.04f, 0f, 12f, 0f)
                moveTo(7.05f, 6.05f)
                lineTo(8.46f, 7.46f)
                curveTo(9.37f, 6.56f, 10.62f, 6f, 12f, 6f)
                curveTo(13.38f, 6f, 14.63f, 6.56f, 15.54f, 7.46f)
                lineTo(16.95f, 6.05f)
                curveTo(15.68f, 4.78f, 13.93f, 4f, 12f, 4f)
                curveTo(10.07f, 4f, 8.32f, 4.78f, 7.05f, 6.05f)
                moveTo(12f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(15f, 9f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 23f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 22f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9f)
                close()
            }
        }.build()

        return _Remote!!
    }

@Suppress("ObjectPropertyName")
private var _Remote: ImageVector? = null
